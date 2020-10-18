
package arrayexercise3;


public class ArrayExercise3 {

    public static void main(String[] args) {
        ArrayExercise3 mainObject=new ArrayExercise3();
//        System.out.println(mainObject.largestAdjacentSum(new int[]{1,7,3,4}));
//        System.out.println(mainObject.checkConcatenatedSum(2997,3));
//        System.out.println(mainObject.isSequencedArray(new int[]{2, 2, 3, 4, 5},2,5));
//        System.out.println(mainObject.largestPrimeFactor(6936));
//
//        for(int element: mainObject.encodeNumber(6936))
//                    System.out.println(element);
//
//        System.out.println(mainObject.matchPattern(new int[]{1, 1, 1, 2, 2, 1, 1, 3},8,new int[]{1, 2, 1, 3,3},4));  
//        System.out.println(mainObject.isZeroPlentiFul(new int[]{1, 2, 0, 0, 0,0, 2, -18, 0, 0, 0, 0, 0, 12}));
//        mainObject.doIntegerBasedRounding(new int[]{1,2,3,4,5}, 2); // only function call no return type
//        System.out.println(mainObject.isCubicPowerfull(407));
//        System.out.println(mainObject.isDigitIncreasing(7404));
//        System.out.println(mainObject.decodeArray2(new int[]{-1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
//        System.out.println(mainObject.decodeArray1(new int[]{0, -3, 0, -4, 0}));
//        System.out.println(mainObject.isOnionArray(new int[]{1, 3, 9, 8})); 
//        System.out.println(mainObject.isPrimeHappy(25));
//        
//        for(int element: mainObject.encodeArray(-201))
//                        System.out.print(element);
//
//        System.out.println(mainObject.isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5})); 
//        System.out.println(mainObject.isSystematicallyIncreasing2(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5})); 
//        System.out.println(mainObject.isFactorialPrime(7));
//        System.out.println(mainObject.largestDifferenceOfEvens(new int[]{-2, 3, 4, 9}));
//        System.out.println(mainObject.isHodder(31));
//        System.out.println(mainObject.areAnagrams2(new char[]{'p','o','o','l'}, new char[]{'p','o','o','l'}));
//        System.out.println(mainObject.closestFibonacci(33));
//        System.out.println(mainObject.isVesuvian(50));
//        System.out.println(mainObject.isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1,0,1,1,3,3,4,0}));
//        System.out.println(mainObject.isFibonacci(13));
//        System.out.println(mainObject.isTriangular(10));
//        System.out.println(mainObject.isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
//        System.out.println(mainObject.is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
//
//        for(int element: mainObject.computeHMS(3735))
//                    System.out.println(element);
//
//        System.out.println(mainObject.isMartian(new int[]{1, 3, 2}));
//        System.out.println(mainObject.isPairedN(new int[]{8, 8, 8, 8, 7, 7, 7},16));
//        System.out.println(mainObject.hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3},3));
//        System.out.println(mainObject.sameNumberOfFactors(6,21));
//        System.out.println(mainObject.eval(2.0,new int[]{4, 0, 9}));
//        System.out.println(mainObject.isAllPossibilities(new int[]{0, 2, 3,1}));
//        System.out.println(mainObject.isLayered(new int[]{2}));
//        mainObject.updateMileagecounter(new int[]{9,9,9,9,9,9,9,9,9,9},1);
//        System.out.println(mainObject.isHollow(new int[]{1,2,0,0,0,3,4}));
//        System.out.println(mainObject.isConsecutiveFactored(90));
//        System.out.println(mainObject.isTwinPrime(7));
        System.out.println(mainObject.isZeroBalanced(new int[]{3, 1, 2, -2, - 1, -3}));
    }
    
    
    
    

 int largestAdjacentSum(int[] a){
        int largestAdjusent=0;

for(int i=0;i<(a.length-1);i++){
   if(a[i]+a[i+1]>largestAdjusent){
       largestAdjusent=a[i]+a[i+1];
   } 
}
return largestAdjusent;
    }
  
 
 
 
int checkConcatenatedSum(int n, int catlen){
int sum=0;

for(int i=n;i>0;i/=10){
    int num=i%10,digit=1,intermidiate=0;
    for(int j=1;j<=catlen;j++){
    intermidiate+=digit*num;
    digit*=10;
    }
    sum+=intermidiate;
}
if(sum==n)
    return 1;
else
return 0;
}



int isSequencedArray(int[] a, int m,int n){

    if(a[0]!=m||a[a.length-1]!=n)
        return 0;
    for(int i=0;i<(a.length-1);i++)
    {
        if(a[i+1]>a[i]&&(a[i]+1)!=a[i+1])
            return 0;
        for(int j=i;j<a.length;j++){
            if(a[i]>a[j])
                return 0;
    }
    
    }
return 1;
}




int largestPrimeFactor(int n){
int largestPrime=1;
MainLoop:for(int i=2;i<=(n/2);i++){
    boolean isPrime=true;
    for(int j=2;j<i;j++){
        if(i%j==0){
            isPrime=false;
            continue MainLoop;
        }
    }
  if(isPrime&&n%i==0){
     largestPrime=i;
     }  
}

return largestPrime;
}


int[] encodeNumber(int n){
int arraySize=0,number=n;

for(int i=number;i>1&&number>1;){
    if(number%i==0){
        boolean isPrime=true;
        for(int j=2;j<i;j++){
            if(i%j==0){
            isPrime=false;
            break;
            }
        }
       if(isPrime){
       arraySize++;
       number=number/i;
       continue;
       }
    }
       i--;
}
System.out.println(arraySize);
int[] encodeArray=new int[arraySize];
number=n;
for(int i=number,arrayIndex=arraySize-1;i>1&&number>1;){
    if(number%i==0){
        boolean isPrime=true;
        for(int j=2;j<i;j++)
        {
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
        encodeArray[arrayIndex]=i;
        number=number/i;
        arrayIndex--;
        continue;
        }
    }
    
        i--;
}

return encodeArray;
}

int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
// len is the number of elements in the array a, patternLen is the number of elements in the
//pattern.
int i=0; // index into a
int k=0; // index into pattern
int matches = 0; // how many times current pattern character has been matched so far
for (i=0; i<len; i++) {
if (a[i] == pattern[k]){
matches++;
}// current pattern character was matched
else if (matches == 0 || k == patternLen-1){
return 0; 
}// if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
else{ // advance to next pattern character 
   if(a[i]==pattern[k+1])
       k++;
   else 
       return 0;
//!!You write this code!!
// our code only goes above this 
} // end of else
} // end of for
// return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
if (i==len && k==patternLen-1) return 1; 


else {

    return 0;
}
}
    void doIntegerBasedRounding(int[ ] a, int n){
        for(int i=0;i<a.length;i++){
            int less=n,big=a[i];
        for(int j=n;i<a[i];j++){
            if((j*2)<a[i])
                less=i*2;
            else{
                big=j*2;
                break;
            }
        }
        if(Math.abs(less-a[i])<Math.abs(big-a[i]))
            a[i]=less;
        else
            a[i]=big;
        }
        for(int element: a){
        System.out.println(element);
        }
}

int isCubicPowerfull(int n){
	
	
	for(int i=n; i>0;i/=10){
		if(i==0&&n<=0)
			return 0;
		 n=n-((i%10)*(i%10)*(i%10));
		
		}
	if(n==0)
		return 1;
	else
		return 0;
	}    
    
int isDigitIncreasing(int n){
    int digitCount=0;
    for(int i=n;i>0;i/=10)
        digitCount++;
    for(int i=1;i<10;i++){
    int sum=0,digitize=1,stack=0;
        for(int j=1;j<=digitCount;j++){
            sum=sum+(i*digitize);
            stack=stack+sum;
            digitize*=10;
        }
       if(stack==n)
           return 1;
    }
    return 0;
}    

int decodeArray1(int[]a){
	int numMult=1,sum=0;
	for(int i=(a.length-1);i>0;i--){
		int digit=0;
		if(i==1){
			digit=a[0]-a[1];
			digit*=numMult;
			if(digit<=0){
				sum *=-1;
				sum+=digit;
				}
				
			else{
				sum+=digit;
				}
			}
		else{
		
			digit=Math.abs(a[i-1]-a[i]);
			digit*=numMult;
			sum+=digit;
		}
			numMult*=10;
		
		}
		return sum;
	}
int isZeroPlentiFul(int[] a){
int numZero=0,counter=0;
boolean countingZero=false;
    for(int i=0;i<a.length;i++){

    if (a[i]==0){
        counter++;
        if(counter>=4){
            numZero++;
            counter=0;
        countingZero=true;
        }
    }
    else{
        if(counter>0&&(!countingZero))
            return 0;
        else{
        countingZero=false;
        counter=0;
        }
     
    }
    }
    
return numZero;
}


int decodeArray2(int[] a){
int i=0,j=0,digitizer=1,counter=0,num=0;
if(a[0]<0){
i=1;j=1;
}
for(;i<a.length;i++)
{
     if(a[i]==1){
    digitizer*=10;
    }
}
digitizer/=10;
for(;j<a.length;j++){
    if(a[j]==0)
        counter++;
    else{
    num+=counter*digitizer;
    counter=0;
    digitizer/=10;
    }
}
if(a[0]<0){
num*=-1;
}
return num;
}


int isOnionArray(int a[ ]){


    for(int i=0,j=(a.length-1);i<j;i++,j--){
        if(a[i]+a[j]>10)
            return 0;
    }
    return 1;
    
}


int isPrimeHappy(int n){
int sum=0;
for(int i=2;i<n;i++){
    boolean isPrime=true;
    for(int j=2;j<i;j++)
        if(i%j==0){
            isPrime=false;
            break;
            }
    if(isPrime)
        sum+=i;
}
if(sum%n==0&&n>1)
    return 1;
else 
    return 0;
}



int[] encodeArray(int n){
int arraySize=0;
boolean isNegative= n<0;
if(isNegative){
    arraySize+=1;
    n=Math.abs(n);
}
for(int i=n;i>0;i/=10)
    arraySize+=(i%10)+1;

int[] decodeArray=new int[arraySize];
for(int i=(arraySize-1);i>0;i--){
    int num=n%10;
    n=n/10;
    decodeArray[i]=1;
    for(int j=num;j>0;j--)
    {
        i--;
        decodeArray[i]=0;
    }
}
 if(isNegative){
        decodeArray[0]=-1;
    }
 
 return decodeArray;   
}

int isSystematicallyIncreasing(int[ ] a){
int nextBig=a.length-1;
for(int i=(a.length-1);i>0;i-=a[i]){
    if(a[nextBig]!=a[i]||(i-a[i])<0)
    {
    return 0;
    }
int j=(i-a[i])+1;
for(;j<i;j++)
{
    if((a[j]+1)!=a[j+1])
        return 0;
    nextBig=j;
}
}
return 1;
}

int isFactorialPrime(int n){
for(int i=2;i<n;i++)
    if(n%i==0)
        return 0;
for(int i=1;i<n;i++)
{
    int fact=1;
    for(int j=2;j<=i;j++)
        fact*=j;
    if((fact+1)==n)
        return 1;
}
    
    return 0;
}

 int largestDifferenceOfEvens(int[ ] a){
int diff=0,evenAmount=0;
for(int i=0;i<(a.length-1);i++){
    if(a[i]%2!=0)
        continue;
    evenAmount++;
    for(int j=(i+1);j<a.length;j++)
        if(a[j]%2==0&&(Math.abs(a[i]-a[j]))>diff)
            diff=Math.abs(a[i]-a[j]);
    
}
if(evenAmount<2)
    return -1;
else 
    return diff;
}

int isHodder(int n) {
for(int i=2;i<n;i++)
    if(n%i==0)
      return 0;
for(int j=2;j<n;j++)
    if((Math.pow(2,j)-1)==n)
        return 1;
return 0;
}



int areAnagrams(char[] a1, char[] a2){
	
if(a1.length!=a2.length)
{return 0;}

int[] checked=new int[a1.length];
for(int i=0;i<checked.length;i++)
{checked[i]=-1;}

for(int i=0;i<a1.length;i++){
	boolean isFound=false;
	for(int j=0;j<a2.length;j++){
		if(a1[i]==a2[j]){
			isFound=true;
			for(int l=0;l<checked.length;l++){
				if(checked[l]==j)
				{
					isFound=false;
					break;
					}
				}
			if(isFound){
				checked[i]=j;
				break;
				}
			}
		}
		if(!isFound)
			return 0;
	}
return 1;
}


int closestFibonacci(int n){
int fivPrev=1,fivResult=1;
for(;fivResult<n;){	
	int temp=fivResult;
	fivResult+=fivPrev;
	fivPrev=temp;
	
	}
return fivPrev;
}



int isVesuvian(int n){

  for(int i=1;i<n;i++)
  	for(int j=1;j<n;j++)
  		if(((i*i)+(j*j))==n)
  			return 1;  	
    	
   return 0;
}

int isOneBalanced(int[ ] a){
    int count1=0,countD=0;
    if(a[0]!=0&&a[0]!=1||a[a.length-1]!=0&&a[a.length-1]!=1)
        return 0;
for(int i=0;i<(a.length-1);i++){
    if(a[i]==1)
    count1++;
    else if(a[i]!=0&&a[i]!=1)
    {
        countD++;
        if(a[i+1]==0||a[i+1]==1){
            if(count1>=countD)
                return 0;
            else{
                countD=0;
                count1=0;
            }
        }
    }
    else {
                countD=0;
                count1=0;
    }

}
    return 1;
}


int isFibonacci(int n) {
int fibB=1,fibR=1;
for(;fibR<=n;)
{
int temp=fibR;
fibR+=fibB;
fibB=temp;
if(fibR==n)
    return 1;
}
    
return 0;
}



int isTriangular(int n){
    int triangular=0;
for(int i=1;triangular<=n;i++)
{
triangular+=i;
if(n==triangular)
    return 1;
}


return 0;
}


int isMercurial(int[ ] a){
    boolean oneIsFount=false,threeIsFound=false;
for(int i=0;i<a.length;i++)
{
    if(threeIsFound&&a[i]==1)
        return 0;
    else if(a[i]==1)
        oneIsFount=true;
    else if(oneIsFount&&a[i]==3)
        threeIsFound=true;
     
}

return 1;
}


int is235Array(int[ ] a){
int sum=0,divider=0;
for(int i=0;i<a.length;i++){
if(a[i]%2!=0&&a[i]%3!=0&&a[i]%5!=0)
{
    divider++;
    continue;
}
if(a[i]%2==0)
   divider++; 
if(a[i]%3==0)
   divider++; 
if(a[i]%5==0)
   divider++;  
}
if(a.length!=divider)
    return 0;
else 
return 1;
}

int[] computeHMS(int seconds){
int[] newTime=new int[3];

int second=seconds%60;
int minute=seconds/60%60;
int houer=seconds/60/60;
newTime[0]=houer;
newTime[1]=minute;
newTime[2]=second;
return newTime;
}


int isMartian(int[ ] a){
int countOnce=0,countTwos=0;
for(int i=0;i<(a.length-1);i++)
{
    if(a[i]==a[i+1])
        return 0;
    else if(a[i]==1)
        countOnce++;
    else if(a[i]==2)
        countTwos++;
}

if(a[a.length-1]==1)
    countOnce++;
else if(a[a.length-1]==2)
    countTwos++;
if(countOnce>countTwos)
    return 1;

return 0;
}



int isPairedN(int[ ] a, int n){
if(a.length<2)
    return 0;
if(a.length==2&&(a[0]+a[1]!=n))
    return 0;
for(int i=0;i<(a.length-1);i++)
    for(int j=i+1;j<a.length;j++)
        if(a[i]+a[j]==n)
            return 1;
    
return 0;
}


int isSystematicallyIncreasing2(int[] a){
    int nextTop=a.length-1;
    for(int i=a.length-1;i>0;i-=a[i]){
        int limit=i-a[i];
        int top=i;
        if(a[top]!=a[nextTop])
        {
        
                    System.out.println(" wrong"+top);
                     return 0;
        }
           
        else{
            for(int j=(limit+1);j<top;j++){
                if(a[j]+1!=a[j+1]) // if the next value of a[j] is not equal to the current a[j] + 1
                {
                     return 0;
                }
            }
        nextTop=top-1;
        }
    }


return 1;

}


int areAnagrams2(char [ ] a1, char [ ] a2){
if(a1.length!=a2.length)
    return 0;
int[] checkRepeat=new int[a1.length];
for(int i=0;i<checkRepeat.length;i++)
    checkRepeat[i]=-1;
for(int i=0;i<a1.length;i++)
{
 boolean isFound=false;
 int j=0;
 for(;j<a2.length;j++){
     if(a1[i]==a2[j]){
     isFound=true;
     for(int l=0;l<checkRepeat.length;l++)
         if(j==checkRepeat[l])
         {
             isFound=false;
             break;
         }
     }
     if(isFound){
         break;
     }
 }
 if(isFound){
     checkRepeat[i]=j;
 }
 else{
 return 0;
 }
}
return 1;
}



int hasNValues(int[ ] a, int n){
int[] newArr=new int[a.length];
boolean isFirst0=true;
int counter=0;
for(int i=0;i<a.length;i++){
boolean newDigit=true;
for(int j=0;j<newArr.length;j++)
{
    if(a[i]==newArr[j]){
        if(a[i]==0&&isFirst0) 
            // since default value of "newArr" for all element 
            //will be zero we will skeep (count++) for
            //the firts a[i]==0 value;
        {
        isFirst0=false;
        break;
        }
        else {
            newDigit=false;
            break;
        }
    }
}
if(newDigit){
newArr[i]=a[i];
counter++;
}
}
if(counter!=n)
    return 0;
else
return 1;
}

int sameNumberOfFactors(int n1, int n2){
int factor1=0,factor2=0;
if(n1<0||n2<0)
    return -1;
for(int i=2;i<n1||i<n2;i++){
if(n1%i==0&&i<n1)
    factor1++;
if(n2%i==0&&i<n2)
    factor2++;
}
if(factor1!=factor2)
return 0;
else 
    return 1;
}

double eval(double x, int[ ] a){
double sum=0;
    for(int i=(a.length-1);i>=0;i--){
    sum +=a[i]*(Math.pow(x,i));
    }
return sum;
}

int isAllPossibilities(int[ ] a){
int count=0;
for(int i=0;i<a.length;i++){
    for(int j=0;j<a.length;j++)
    {
        if(a[j]==i)
        {
            count++;
            break;
        }
    }
}
    
if(a.length==count)
    return 1;
else 
    return 0;
}


int isLayered(int[ ] a){
    if(a.length<2)
        return 0;
for(int i=0;i<a.length;i++)
{
    int count=0;
        for(int j=0;j<a.length;j++){
            if(a[i]==a[j])
                count++;
        }
    if(count%2==0)
        return 0;
}
int b[];
b=new int[]{8, 9, 9, 5, 0};
    return 1;
}


void updateMileagecounter(int[ ] a, int miles){
int num=0,i=0,digit=1;
for(i=0;i<a.length;i++)
{
    num+=a[i]*digit;
    digit*=10;
}
num+=miles;
if(num>999999999)
    num=miles-1;
for(i=0;i<a.length;i++,num/=10){
    a[i]=num%10;
}
for(int element: a){
System.out.print(element+",");
}

}


int isHollow(int[ ] a){
int state=1,firstCount=0,secondCount=0,zeroCount=0;
if(a[0]==0)
    state=2;
for(int i=0;i<a.length;i++){
if(state==1&&a[i]!=0)
{
    firstCount++;
    if(a[i+1]==0){
        state=2;
    }
}
else if(a[i]==0&&state==2){
        zeroCount++;
        if(a[i+1]!=0)
            {
                state=3;
            }
    }
else if(a[i]!=0&&state==3){
    secondCount++;
}
else{
    return 0;
}

}

if(firstCount!=secondCount||zeroCount<3)
    return 0;
else 
return 1;
}

int isConsecutiveFactored(int n){
for(int i=2;i<n;i++){
    if(n%i==0&&n%(i+1)==0)
        return 1; 
}
return 0;
}

int isTwinPrime(int n){
int count=0;
for(int i=2;i<n;i++)
    if(n%i==0)
        return 0;
n+=2;
boolean n2IsPrime=true;
for(int i=2;i<n;i++)
    if(n%i==0)
    {
    n2IsPrime=false;
    break;
    }
if(n2IsPrime)
    return 1;
n2IsPrime=true;
n-=4;
for(int i=2;i<n;i++){
    if(n%i==0){
    n2IsPrime=false;
    break;
    }
}   
if(n2IsPrime)
    return 1;
else 
    return 0;
}


int isZeroBalanced(int a[ ]){
    int num=0,sum=0;
for(int i=0;i<a.length;i++)
{
    sum+=a[i];
    num=a[i]*-1;
boolean isFound=false;
for(int j=0;j<a.length;j++){
    if(num==a[j])
    {
        isFound=true;
        break;
    }
}
if(!isFound)
    return 0;
}
 if(sum!=0)
     return 0;
   else
    return 1;
}
}
