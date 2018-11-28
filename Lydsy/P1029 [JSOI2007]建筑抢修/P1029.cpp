#include <stdio.h>
#include <algorithm>
#include <queue>
#define MAXN 170000
using namespace std;
struct T
{
	int t1,t2;
	friend bool operator<(T a,T b){return a.t2<b.t2;} //������
}a[MAXN];
priority_queue<int>q; //�����q�����Ѿ�����Ľ����ĸ��Ե���������ʱ��
int main()
{
	int i,j,n,nowtime=0; //nowtime=��ǰʱ��
	scanf("%d",&n);
	for(i=1;i<=n;i++)
		scanf("%d%d",&a[i].t1,&a[i].t2);
	sort(a+1,a+n+1); //������ʱ����������
	for(i=1;i<=n;i++)
	{
		if(nowtime+a[i].t1<=a[i].t2) //��������i���������ʱ��ȵ�i��������ʧʱ����
		{	
			nowtime+=a[i].t1; //��ǰʱ����ϵ�i��������������ʱ��
			q.push(a[i].t1); //����i��������������ʱ�����
		}
		//�����ڵ�i��������ʧǰ�����޺�������ô����Ҫ�ж��Ƿ���Ҫ���֮ǰһ���޹��Ľ������ڳ�ʱ�����������
		else if(nowtime+a[i].t1-q.top()<=a[i].t2&&a[i].t1<=q.top()) //����֮ǰ���ʱ�Ľ���������������޺ã��ҽ���i��ʱ���Ǹ������٣��Ǹ�������Ǹ����ʱ�Ľ���
		{
			nowtime=nowtime+a[i].t1-q.top();
			q.pop();
			q.push(a[i].t1);
		}
	}
	printf("%d\n",q.size()); //���մ�������Ԫ����Ŀ�������Ȼ�������ཨ����
	return 0;
}
