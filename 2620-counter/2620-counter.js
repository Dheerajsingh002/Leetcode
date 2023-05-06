/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    return function() {
        return n++;
        
        
    };
};
const n = 10;
const counter = createCounter(n);
const output = [];
output.push(counter()); // 10
output.push(counter()); // 11
output.push(counter()); // 12

console.log(output);
/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */