Var a,b,c,d,e,f:integer;
begin
writeln('������� a');
readln(a);
writeln('������� b');
readln(b);
writeln('������� c');
readln(c);
writeln('������� d');
readln(d);
e:= (100*c+d-100*a-b)div 100;
f:=(100*c+d-100*a-b)mod 100;
writeln(e,' ��� ',f,' ���');
end.