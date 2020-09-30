#include <bits/stdc++.h>

using namespace std;

string encryption(string s) {
int n=s.size();
int jump=sqrt(n);
if(jump*jump!=n){
    jump++;
}
string ans="";
for(int i=0;i<jump;i++){
    for(int j=i;j<n;j+=jump){
        ans+=s[j];
    }
    ans+=" ";
}
return ans;

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = encryption(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
