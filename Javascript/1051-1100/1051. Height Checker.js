var heightChecker = function(heights) {
        let expected = heights.slice().sort((a, b) => a - b);

        let difference  = 0;

        for(let index=0; index<heights.length; index++)
            if(heights[index] != expected[index]) difference++;

        return difference;
};
