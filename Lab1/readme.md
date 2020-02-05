# LAB-1: DATA TYPE AND ARRAY IN JAVA

# THEORY:

## DATA TYPES
Data tyes specifies the different sizes and values that can be stored in the variable.It is of two types:
* **Primitive data type**: It includes:
	- boolean data type
	- byte data type
	- char data type
	- short data type
	- int data type
	- long data type
	- float data type
	- double data type

* **Non-primitive data type** : It includes:
	- classes 
	- Interfaces
	- Arrays

## ARRAY
An array is a collection of similar type of elements which have a contiguous memory location.It is of two type:
* Single Dimensional Array
* Multidimensional Array

### Example:
int a[]=new int[2];//declaration and instantiation of single dimensional array

int[][] arr=new int[3][3];//declaration and instantiation of multidimensional array

# CODE FOR IMPLEMENTATION OF ARRAY

## Single Dimensional Array

```javascript
class Testarray{  
public static void main(String args[]){  
int a[]={33,3,4,5};
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
}} 
``` 

### Output
33\
3\
4\
5

## MultiDimensional Array

```javascript
class Testarray{  
public static void main(String args[]){  
//declaring and initializing 2D array  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
}}  
```

### Output
1 2 3\
2 4 5\
4 4 5
