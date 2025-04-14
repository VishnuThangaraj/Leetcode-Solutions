// https://leetcode.com/problems/count-good-triplets/

var countGoodTriplets = function(arr, a, b, c) {
    let result = 0;

    for(let i=0; i<arr.length; i++){
        for(let j=i+1; j<arr.length; j++){
            for(let k=j+1; k<arr.length; k++){
                if(Math.abs(arr[i] - arr[j]) <= a){
                    if(Math.abs(arr[j] - arr[k]) <= b){
                        if(Math.abs(arr[i] - arr[k]) <= c){
                            result++;
                        }
                    }
                }
            }
        }
    }

    return result;
};
