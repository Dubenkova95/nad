Var a,b,c,d,e,f:integer;
begin
writeln('¬ведите a');
readln(a);
writeln('¬ведите b');
readln(b);
writeln('¬ведите c');
readln(c);
writeln('¬ведите d');
readln(d);
e:= (100*c+d-100*a-b)div 100;
f:=(100*c+d-100*a-b)mod 100;
writeln(e,' руб ',f,' коп');
end.