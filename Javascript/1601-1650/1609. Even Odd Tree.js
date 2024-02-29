// https://leetcode.com/problems/even-odd-tree/

var isEvenOddTree = function(root) {
    const storage = [];
    let isOdd = true;

    storage.push(root); // Add root to the queue

    while(storage.length > 0){
        const size = storage.length;
        let previous = (isOdd) ? Number. MIN_SAFE_INTEGER : Number. MAX_SAFE_INTEGER;

        for(let loop=0; loop<size; loop++){
            const current = storage.shift();

            if(isOdd){
                if(current.val % 2 == 0 || previous >= current.val) return false;
            }else{
                if(current.val % 2 != 0 || previous <= current.val) return false;
            }

            previous = current.val;
            // Add left and right childrens to the queue
            if(current.left != null) storage.push(current.left);
            if(current.right != null) storage.push(current.right);   
        }

        isOdd = !isOdd;
    }

    return true;
};
