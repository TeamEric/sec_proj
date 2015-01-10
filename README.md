# sec_proj
The "Security" project we worked on in early 2014.

This set of programs has to be dumped in a specific folder on a linux live drive (set up with persitency) and run in a specific order. There really isn't any way to do this correclty without our help.

What we did:
Boot to Linux
Make backup of SAM file (password hashes)
Replace sethc.exe (stickykeys) with the command prompt (cmd.exe)
Reboot to Windows
Activate sethc.exe (which is now just a renamed version of cmd.exe)
run the "master" program (resets all user's passwords to nothing)
you're in!

Essentially this is what it does.
We tried to make this an automatic thing, but ran into a few roadblocks and just didn't have the time to sort them out.
It may be improved later on, but likely not.
