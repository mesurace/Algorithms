var practice=function(){
  
  // remove duplicate
  var removeDuplicate=function(array){

  var result=[];
  
  var hashMap={};
  
  var i;
  var len=array.length;
  
  for(i=0;i<len;i++){
    
    if(!hashMap.hasOwnProperty(array[i])){
      result.push(array[i]);
      hashMap[array[i]]++;
    } 
  }
  return result;
  }
  
  //reverse string
  var StringReverse=function(string){
  
  return string.split("").reverse().join("");
  }
  
  
  //nth fibo number using recursion
  var fiboNumber=function(n){
    
    if(n<1)
      return -1;
    var memo=[0,1];
    if(n<2){
      return memo[n-1];
    } 
    
    return fiboUtl(n, memo);
    
  }
  
  var fiboUtl=function(n,memo){
    
    if(n<3)return memo[1];
    else{
      
      var temp=memo[0]+memo[1];
      memo[0]=memo[1];
      memo[1]=temp;
      
      return fiboUtl(n-1, memo);
      
    }
    
  }
  
  //check wheater a string is palindrome or not
  var isStringPalindrome1=function(str){
    return str==str.split("").reverse().join("");
    
  }
  
  var isStringPalindrome2=function(value) {
    var len = value.length;
    var mid=Math.floor(len/2);
    for ( var i = 0; i < mid; i++ ) {
        if (value[i] !== value[len - 1 - i]) {
            return false;
        }
    }
    return true;
  }
  
  
  // second smallest number from int array
  var secondSmalletNumber=function(array){
    
    var len=array.length;
    
    if(len===0)return -1;
    if(len==1){
      return array[0];
    }
    
    var small=array[0];
    var smallest=array[1];
    var i;
    
    for(i=1;i<len;i++){
      
      if(smallest>array[i]){
        small=smallest;
        smallest=array[i];
      }else if(small>array[i]){
        small=array[i];
      }
      
    }
    return small; 
    
  }
  
  //second heighest element from int array
  var secondHighestElement=function(array){
    
    var len=array.length;
    if(len===0) return -1;
    if(len==1) return array[0];
    var highest=array[0];
    var secondHighest=array[1];
    var i;
    
    for(i=1;i<len;i++){
      if(highest<array[i]){
        secondHighest= highest;
        highest=array[i];
      }else if(secondHighest<array[i]){
        secondHighest=array[i];
      }
      
    }
    return secondHighest; 
  }
  
  return {
    
    removeDuplicate:removeDuplicate,
    stringReverse:StringReverse,
    fiboNumber: fiboNumber,
    isStringPalindrome1:isStringPalindrome1,
    isStringPalindrome2:isStringPalindrome2,
    secondSmalletNumber:secondSmalletNumber,
    secondHighestElement:secondHighestElement
  }
  
}();