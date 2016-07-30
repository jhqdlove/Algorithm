#include<iostream>
#include<vector>
#include<queue>
#include<set>

using namespace std;
typedef long long LL;
const int coeff[3]={2,3,5};
const int N=1500;

int main(){
	priority_queue< LL,vector<LL>>,greater<LL> > pq;
	set<LL> s;
	
	pq.push(1);
	s.insert(1);
	
	for(int i = 1 ;i <= N;i++){
		int x=pq.top(); 
		pq.pop();
						
	}
	
	
	return 1;
} 
