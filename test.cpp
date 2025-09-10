/*#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
int main(){
    string s;
    cin>>s;
    vector <int> num;
    for(char c:s){
        if(c !='a'){
            num.push_back(c-'0');
        }
    }
    sort(num.begin(),num.end());
    for(int i=0;i<num.size();++i){
        if(i!=0){
            cout<<'+';
        }
        cout<<num[i]<<endl;
    }
    cout<<endl;
    return 0;
}*/
/*#include <bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin >> s;
    sort(s.begin(), s.end());
    for (int i = 0; i < s.size(); i += 2){
        if (i != 0){
            cout << "+";
        }
        cout << s[i];
    }
}*/
/*#include <iostream>
#include <string>

using namespace std;

int main(){
    string s;
    cin>>s;
    int lcount=0;
    int ucount=0;
    
    for(char i:s){
        if(isupper(i)){
            ucount++;
        }
        else{
            lcount++;
        }
    }
    
    if(ucount>lcount){
        for(char &i:s){
            i=toupper(i);
        }
    }
    else{
        for(char &i:s){
            i=tolower(i);
        }
    }
    cout<<s<<endl;
    return 0;
}*/

/*#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    string s;
    cin>>s;
    int lcount=0;
    int ucount=0;
    
    for(char i:s){
        if(isupper(i)){
            ucount++;
        }
        else{
            lcount++;
        }
    }
    if(ucount>lcount){
        std::transform(s.begin(),s.end(),s.begin(),::toupper);
    }
    else{
        std::transform(s.begin(),s.end(),s.begin(),::tolower);
    }
    cout<<s<<endl;
    return 0;
}*/

#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n, count;
    cin >> n;
    
    count = 1; // Start with 1 group (the first magnet)
    
    vector<int> magnet(n);
    for (int i = 0; i < n; i++) {
        cin >> magnet[i];
    }
    
    // Count groups: each time the polarity changes, we have a new group
    for (int i = 1; i < n; i++) {
        if (magnet[i] != magnet[i-1]) {
            count++;
        }
    }
    
    cout << count << endl;
    return 0;
}