/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let Arrayy=[];
    for(let i=0;i<arr.length;i++)
        {
            Arrayy.push(fn(arr[i],i));
        }
    return Arrayy;
    
};