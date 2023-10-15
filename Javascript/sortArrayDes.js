const arr1 = [1,2,2,4,5];

function arrSort(arr) {
    arr.sort((a,b)=>a-b);
    arr.reverse();
    return arr;
}

console.log(arrSort(arr1));

/*
[ 5, 4, 2, 2, 1 ]
*/