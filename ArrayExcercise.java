
package arrayexcercise;

public class ArrayExcercise {


    public static void main(String[] args) {
        ArrayExcercise mainObject=new ArrayExcercise();
      //System.out.println(mainObject.isNUnique(new int[ ]{2, 7, 3, 4}, 5));
      //System.out.println(mainObject.isSquare(25));
      //System.out.println(mainObject.isLegalNumber(new int[] {3, 2, 1}, 4));
      //System.out.println(mainObject.convertToBase10(new int[] {1, 0, 1,1}, 2));
      //System.out.println(mainObject.matches(new int[]{1,2,3,-5,-5,2,3,18},new int[]{3,-2,3}));
      //System.out.println(mainObject.isStacked(9));
      //System.out.println(mainObject.isSumSafe(new int[]{5,-2,1}));
      //System.out.println(mainObject.isIsolated(163));
      //System.out.println(mainObject.isVanilla(new int[]{111,111,1}));
      //System.out.println(mainObject.isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
    }
    
    
    
    
 // is n-unique function begin   
 int isNUnique(int[] a,int n ){
     int counter=0;
     for(int i=0;i<a.length;i++){
         for(int j=i;j<a.length;j++){
         if(a[i]+a[j]==n&&i!=j){
             counter++;
         }
         
         }
         
     }
     
  if(counter==1)
     return 1;
  else
     return 0;
 } 
// is n-unique function end
//-------------------------------
 
 
 
 // isSquare function begin
int isSquare(int n){
    for(int i=1;i<n;i++){
        if(i*i==n){
            return 1;
        }
    }
return 0;
}
 // isSquare function end
//-------------------------------


// isLegalNumber function start
int isLegalNumber(int[] a,int base){

    for(int i=0;i<a.length;i++){
    if(a[i]>=base){
        return 0;
    }
    }
    
 return 1;
}
// isLegalNumber function end
//-------------------------------



//convertToBase10 function begin 
int convertToBase10(int[] a,int base){
if(isLegalNumber(a,base)==0)
    return -1;
int base10=0;
for(int i=(a.length-1),j=0;i>=0;i--,j++){
    int pow=1;
        for(int l=1;l<=j;l++){
            pow=pow*base;
        }
    base10=base10+(a[i]*pow);
}
return base10;
}
//convertToBase10 function end 
//-------------------------------



//matches function start
int matches(int[] a, int[] p){
    int j=0;
   for(int i=0;i<p.length;i++){
       boolean isNegative=false;
       if(p[i]<0)
           isNegative=true;
       if(i==0)
           j=0;
      int max=j+Math.abs(p[i]);
        for(;j<max;j++){
           if(isNegative)
           {
                if(a[j]>0)
                {
                    return 0;
                }
           }
           else {
                if(a[j]<0){
                    return 0;
                }
           
           }
       }
   }
 return 1;
}
//matches function end
//-------------------------------




// isStack function begin 
int isStacked(int n){
int sum=0;
    for(int i=1;sum<=n;i++){
        sum=sum+i;
        if(sum==n)
            return 1;
    }
   return 0; 
}
// isStack function end
//---------------------------------





// isSumSafe function start
int isSumSafe(int[] a){

    int sum=0;
    for(int i=0;i<a.length;i++){
    sum +=a[i];
    }
    for(int j=0;j<a.length;j++){
    if(a[j]==sum)
        return 0;
    }
    return 1;
}

// isSumSafe function end
//---------------------------------





// isIsolated function start
int isIsolated(long n){
if(n<1||n>2097151 )
    return -1;
    long square=n*n,qube=n*n*n;
    for(long i=square;i>0;i /=10){
        long num=i%10;
            for(long j=qube;j>0;j/=10){
                   if(num==j%10){
                   return 0;
                   }
            }
    }
 return 1;   
}

// isIsolated function end
//---------------------------------






//isVanilla function start
int isVanilla(int[] a){
int firstDigit=a[0]%10;

for(int i=0;i<a.length;i++){

    for(int j=a[i];j>0;j/=10){
    if(j%10!=firstDigit)
        return 0;
    }
}


return 1;
}

// isVanilla function end
//---------------------------------




// isTrivalent function start
int isTrivalent(int[] a){
int counter=1,firstNumber=a[0],secondNumber=a[0],thirdNumber=a[0];
  for(int i=0;i<a.length;i++){
  if(a[i]!=firstNumber&&counter==1){
  counter++;
  secondNumber=a[i];
  }
  else if(a[i]!=firstNumber&& a[i]!=secondNumber &&counter==2){
      counter++;
      thirdNumber=a[i];
  }
  else if(a[i]!=firstNumber && a[i]!=secondNumber && a[i]!=thirdNumber && counter==3)
      return 0;
  }  
  if(counter<3)
      return 0;
  else 
 return 1;   
}

// isTrivalent function end
//---------------------------------

}
