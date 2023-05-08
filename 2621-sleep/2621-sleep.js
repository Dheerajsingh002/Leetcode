/**
 * @param {number} millis
 */
async function sleep(millis) {
    const promise = new Promise((ressolve,reject)=>{
        setTimeout(()=>
                  {
            ressolve();
        },millis);
    });
    return promise;
    
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */