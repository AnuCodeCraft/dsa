/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {
    let result = [], len = arr.length, i = 0;

    while (i < len) {
        let chunk = [];

        for (let j = 0; j <size; j++) {
            if(arr[i]) chunk.push(arr[i]);
            i++
        };
        result.push(chunk);
    }

    return result;
};


