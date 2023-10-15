//reverse of the String
var string = "This is a sunny day";

//reverse string
var reverseallstrings = reverseWord(string,"");
var output = reverseWord(reverseallstrings," ");
console.log(output);

function reverseWord(string,separator){
  return string.split(separator).reverse().join(separator);
}

/*
sihT si a ynnus yad
*/