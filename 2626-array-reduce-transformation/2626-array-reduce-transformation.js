/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    var val=init;
    for(var i of nums)
    {
        val=fn(val,i);
    }
    return val;
    
};