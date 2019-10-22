# DailyProgramming
Repository for daily algorithm quiz from '매일프로그래밍'

When I solve algorithm Quiz to study, I wanted store it and check all of result for one execution.<br/>
So I add a class daily and check in main class.<br/>

> In main class, input date like "yyyymmdd".
<pre><code>// input date for get class name
System.out.println("날짜를 입력하세요. '0'을 입력하시면 종료합니다. ex)20191020");
String date = new Scanner(System.in).next();
if (date.equals("0")) { return; }
String className = "com.practice.Q".concat(date);
</code></pre>

> Then find class with input date (classes's name's format is 'Q'+date)
<pre><code>// find class and get default constructor
Class<?> Qclass = Class.forName(className);
Class[] types = {};
Constructor constructor = Qclass.getConstructor(types);
</code></pre>

> Finally, execute default constructor of class found
<pre><code>// run constructor of the class that I found.
Object[] parameters = {};
constructor.newInstance(parameters);
</code></pre>

> with some Exceptions like 'ClassNotFoundException'.. etc.

<hr/>

Quizzes are from <https://mailprogramming.com>
