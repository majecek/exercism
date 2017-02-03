const pino = require('pino')();

// const pino2 = new pino();

export  default  function isLeapYear(year) {

  // pino.info(year);
  pino.info(year+"-"+((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));

  return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
}