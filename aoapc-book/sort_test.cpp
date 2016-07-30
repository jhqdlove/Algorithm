#include<cstdio>
#include<cstdlib> 
#include<algorithm> 
using namespace std;

int main(){

}

void sort_test(){
	int a[] = {3,2,4};
	sort(a,a+3);//对给定区间所有元素进行排序
	printf("%d,%d,%d",a[0],a[1],a[2]);
}

void sort_dsc_test(){
	int a[] = {3,2,4};
	sort(a,a+3);//对给定区间所有元素进行排序
	printf("%d,%d,%d",a[0],a[1],a[2]);
}
