
package arrayexercise2;

public class ArrayExercise2 {
    
    public static void main(String[] args) {
        ArrayExercise2 mainObject=new ArrayExercise2();
        //System.out.println(mainObject.countRepresentation(12));
        //System.out.println(mainObject.isSequentiallyBounded(new int[]{5,5,5,5,5}));
        //System.out.println(mainObject.isMinMaxDisjoint(new int[]{5, 4, 3, 3, 2}));
        //System.out.println(mainObject.smallest(4));
        
        
        
        //clusterCompression function call and result display 
//        for(int element: mainObject.clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})){
//        System.out.println(element);
//        }

        //System.out.println(mainObject.isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0,3, 3}));
        //System.out.println(mainObject.fullnessQuotient(94));
        //System.out.println(mainObject.isPacked(new int[]{1, 3, 3, 3, 2, 2}));
        //System.out.println(mainObject.isOddHeavy(new int[]{2, 4, 6, 8, 11}));
//        System.out.println(mainObject.getExponent(162,3));
//        System.out.println(mainObject.is121Array(new int[]{1,1,2,2,2,2,1,}));



//filterArray function call and result display 
//        for(int element : mainObject.filterArray(new int[]{8, 4, 9, 0, 3, 1, 2},88)){
//        System.out.println(element);
//        }
        
        

    }
    
    
    
//countRepresentation start 
 int countRepresentation(int numRupees){
 
int count = 0;
      for(int rupe20=0;rupe20<=(numRupees)/20;rupe20++){
          
          for(int ruppe10=0;ruppe10<=(numRupees-(rupe20*20))/10;ruppe10++){
              
              for(int ruppe5=0;ruppe5<=(numRupees-(ruppe10*10+rupe20*20))/5;ruppe5++){
                  
                  for(int ruppe2=0;ruppe2<=(numRupees-(ruppe5*5+ruppe10*10+rupe20*20))/2;ruppe2++){
                      
                      for(int ruppe1=0; ruppe1<=(numRupees-(ruppe2*2+ruppe5*5+ruppe10*10+rupe20*20));ruppe1++){
                          
                          if(ruppe1*1+ruppe2*2+ruppe5*5+ruppe10*10+rupe20*20==numRupees){
                              count++;
                          }
                          
                      }
                  }
              }
          }
      }
        return count;
 } 
//countRepresentation end 
 //--------------------------






 
 //isSequentiallyBounded start 
 int isSequentiallyBounded (int[] a){
 
     for(int i=0;i<a.length;i++){
     int countI=0;
     int iValue=a[i];
     for(int j=i;j<a.length;j++){
         if(a[i]==a[j])
             countI++;
         if(a[j]<a[i]||iValue<=countI)
             return 0;
     
     }
     
     }
 return 1;
 }
 //isSequentiallyBounded end 
 //--------------------------






 
 //isMinMaxDisjoint start 
 int isMinMaxDisjoint(int[] a){
     
     int min=0;
     int max=0;
     int MaxOccuranceCount=0;
     int minOccuranceCount=0;
     
     for(int i=0;i<a.length;i++){
         if(a[i]>=a[max]){
             if(a[i]==a[max]){
                 MaxOccuranceCount++;
             }
             else{
             MaxOccuranceCount=1;
             max=i;
             }
         }
         else if(a[i]<=a[min]){
         if(a[i]==a[min]){
                 minOccuranceCount++;
             }
             else{
             minOccuranceCount=1;
             min=i;
             }
         }
       
     }
     if((max-1)==min||(min-1)==max||minOccuranceCount>1||MaxOccuranceCount>1)
         return 0;
     else
     return 1;
 }
 
 //isMinMaxDisjoint end 
 //--------------------------



 
 
 
  //smallest start 
 int smallest(int n){
int mainNumber=0;
for(int i=1,counter=0;counter<n;i++){
    counter=0;
MultiplayTheNumber:for(int j=1;j<=n;j++){
    int number=i*j;
    for(;number>0;number/=10)
    {
        if(number%10==2){
        counter++;
        if(counter==3){
        mainNumber=i;
        break;
        }
        continue MultiplayTheNumber;
        }
    }
}
}
 return mainNumber;
 }
 
  //smallest end 
//--------------------------





  //clusterCompression start  
 int[] clusterCompression (int[] a){
 
 int clusterSize=1;
 for(int i=0;i<(a.length-1);i++){
     if(a[i]!=a[i+1]){
     clusterSize++;
     }
 }
 int[] clusterArray=new int[clusterSize];
 for(int i=0,clusterIndex=0;i<(a.length-1);i++){
 if(a[i]!=a[i+1]){
 clusterArray[clusterIndex]=a[i];
 clusterIndex++;
 }
 }
 if(a[(a.length-1)]!=a[(a.length-2)]){
 clusterArray[clusterArray.length-1]=a[(a.length-1)];
 }
 
 return clusterArray;
 }
 
  //clusterCompression end 
 //--------------------------






 
 
   //isRailroadTie start  
 int isRailroadTie(int[] a){
     if(a[0]==0||a[a.length-1]==0)
         return 0;
 for(int i=1;i<(a.length-1);i++){
    if(a[i]==0){
        if(a[i-1]==0||a[i+1]==0)
            return 0;
    }
    else{
        if(a[i-1]==0&&a[i+1]==0||a[i-1]!=0&&a[i+1]!=0)
            return 0;
    }
 }
 return 1;
 }
 
 //isRailroadTie end 
 //--------------------------






 
 
 
   //fullnessQuotient start  
 int fullnessQuotient(int n){
 int counter=0;
 
 for(int i=2;i<10;i++){
 boolean isZero=false;
 for(int j=n;j>=i;j/=i){
     isZero=false;
 if(j%i==0)
     isZero=true;
 
 }
 if(!isZero){
     System.out.println();
 counter++;
 }
 }
 return counter;
 }
//fullnessQuotient end 
//--------------------------






 
 
//isPacked start  
 int isPacked(int[ ] a){
 int counter=0;
 for(int i=0;i<(a.length-1);i++){
    counter++;
    if(a[i]!=a[i+1]){
        if(counter!=a[i]){
            return 0;
        }
    counter=0;
    }
 }
 counter++;
 if(a[a.length-1]==a[a.length-2]){
     if(counter!=a[a.length-2])
         return 0;
 }
 else {
 if(a[a.length-1]!=1){
 return 0;
 }
 }
 return 1;
 }
//isPacked end 
//--------------------------






 
 
 
 //isOddHeavy start  
 int isOddHeavy(int[] a){
 boolean isOddExsit=false;
 for(int i=0;i<a.length;i++){
 if(a[i]%2==0)
     continue;
 isOddExsit=true;
 for(int j=0;j<a.length;j++)
     if(a[j]%2==0){
         if(a[i]<=a[j])
             return 0;
     }
 }
 
 if(!isOddExsit)
     return 0;
 else
 return 1;
 }
//isOddHeavy end
//--------------------------






 
 
 
 
   //getExponent start  
int getExponent(int n, int p){
int ex=1;
if(p<=0)
    return -1;
for(int x=1;x<n;x++){
    if(n%(Math.pow(p, x))==0){
        ex=x;
    }
    if(Math.pow(p, x)>n){
    break;
    }
}
return ex;
} 
   //getExponent end 
//--------------------------







  //is121Array start  
int is121Array(int[] a){
if(a[0]!=1||a[a.length-1]!=1)
    return 0;
int beginOnce=0,endOnce=0;
boolean doesTwoExist=false;

for(int i=0;i<a.length;i++){
if(a[i]==2)
    doesTwoExist=true;
if(a[i]!=1&&a[i]!=2||endOnce!=0&&a[i]==2)
    return 0;
if(a[i]==1&&(!doesTwoExist))
    beginOnce++;
if(a[i]==1&&(doesTwoExist))
    endOnce++;
}

if(beginOnce!=endOnce)
    return 0;
else
    return 1;
}
//is121Array end 
//--------------------------









  //filterArray start  
int[] filterArray(int[] a,int n){
int arraySize=0;
for(int i=n;i>0;i/=2){
if(i%2!=0){
arraySize++;
}
}

int[] filterArray=new int[arraySize];
for(int i=n,counter=0,iterator=0;i>0;iterator++,i/=2){
    if(i%2!=0){
    filterArray[counter]=a[iterator];
    counter++;
    }
}

return filterArray;
}
}
//filterArray end 
//--------------------------





