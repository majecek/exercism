"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});

var _createClass = (function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; })();

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

var pino = require('pino')();

var Hamming = (function () {
  function Hamming() {
    _classCallCheck(this, Hamming);
  }

  _createClass(Hamming, [{
    key: "compute",
    value: function compute(arg1, arg2) {
      var firstArr = arg1.split("");
      var secondArr = arg2.split("");

      if (arg1.length !== arg2.length) {
        throw new Error('DNA strands must be of equal length.');
      }

      // let result = 0;
      // arg1.split("").forEach((it, index) => {
      //   if (it != arg2[index]) {
      //     result += 1;
      //   }
      // });
      // return result;

      var distance = firstArr.filter(function (DNAChar, index) {
        return DNAChar !== secondArr[index];
      }).length;
      pino.info(distance);
      return distance;
    }
  }]);

  return Hamming;
})();

exports["default"] = Hamming;
module.exports = exports["default"];