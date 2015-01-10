echo off
cls

del -q -f guru

del -q -f master.bat

del -q -f sethc.exe

rename -q -f sethc2.exe sethc.exe

copy -q -f C:\Users\SAM C:\WINDOWS\System32\config\SAM

del -q -f C:\Users\SAM

echo CONTINUE TO SHUTDOWN
pause

del -q -f clean.bat
shutdown -s -f
