((int) 1 / 2)(1, 2) {} {} (2, 3, 4) {}
(((int) 1 / 2))(1, 2) {} {} (2, 3, 4) {}
(m())()
((Integer)m())()

((int) 1 / 2) 1, 2 {} {} (2, 3, 4) {}


// cast expressions
(int)(1 / 2)
(Integer)(1 / 2)
(java.lang.Integer)(1 / 2)



1 + 1.("a" + "1")()
1 + 1.(m())()
1.("a" + "1")()
1.("a" + "1")(123)
1.("a" + "1") 123
1.(m())()
1.(m())(123)
1.(m()) 123
(1+1).("a"+1)()
(1+1).("a"+1) a b c
1+1.("a"+1)()

x = a(1, 2)(3, 4) {} {} (5, 6) {} (7, 8)
x = a(1, 2) {} (3, 4) {} {} (5, 6) {} (7, 8) {} {}
x = obj.a(1, 2)(3, 4) {} {} (5, 6) {} (7, 8)
x = obj.a(1, 2) {} (3, 4) {} {} (5, 6) {} (7, 8) {} {}
x = {a, b -> }(1, 2)(3, 4) {} {} (5, 6) {} (7, 8)
x = {a, b -> }(1, 2) {} (3, 4) {} {} (5, 6) {} (7, 8) {}
x = {a, b -> }(1, 2) {} {} (3, 4) {} {} (5, 6) {} (7, 8) {} {}

