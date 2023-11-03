package com.example.a45

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(s: String, n: Int): String {
                var answer = ""
                var s_Chararray :CharArray
                s_Chararray = s.toCharArray()
                for(i in 0 until s.length){
                    //공백의 경우 생략
                    if(s_Chararray[i] ==' '){
                        continue
                    }
                    //A~Z : 65~90 , a~z 97~122 아스키 코드값
                    //대문자의경우
                    if (s_Chararray[i]<='Z') {
                        s_Chararray[i] = s_Chararray[i] + n
                        if(s_Chararray[i]>'Z')
                            s_Chararray[i] = s_Chararray[i]-26
                    }
                    else if(s_Chararray[i]<='z'){
                        s_Chararray[i] = s_Chararray[i] + n
                        if(s_Chararray[i]>'z')
                            s_Chararray[i] = s_Chararray[i]-26
                    }
                }
                answer = StringBuilder().append(s_Chararray).toString()

                return answer


            }
        }
        val a = Solution()
        a.solution("AB",1)//"BC"
        a.solution("z",1)//"a"
        a.solution("a B z",4)//"e F d"
    }
}