class Solution {
public:
    vector<int>t;
    string st;
    string encode(vector<string>& strs) {
        for(auto x:strs){
            t.emplace_back(x.size());
            st.append(x);
        }
        return st;
    }

    vector<string> decode(string s) {
        vector<string> ans;
        int j{};
        int l{};
        for(int i=0;i<t.size();i++){
            j = t[i];
            string p="";
            int k{};
            for(k=l;k<l+j;k++){
                p.push_back(s[k]);
            }
            l = k;
            cout << l << endl;
            ans.push_back(p);
        }
        return ans;
    }
};
