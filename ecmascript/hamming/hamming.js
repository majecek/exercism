var pino = require('pino')();
class Hamming {

  compute(arg1, arg2) {
    const firstArr = arg1.split("");
    const secondArr = arg2.split("");

    if (arg1.length !== arg2.length) {
      throw new Error('DNA strands must be of equal length.');
    }

    const distance = firstArr.filter((DNAChar, index) => DNAChar !== secondArr[index]).length;
    pino.info(distance);
    return distance;
  }
}

export default Hamming;