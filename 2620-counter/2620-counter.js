/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let previousValue = null;
    
    return function() {
        if(previousValue == null){
            previousValue = n
        }else{
            previousValue = previousValue + 1;
        }
        return previousValue;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */