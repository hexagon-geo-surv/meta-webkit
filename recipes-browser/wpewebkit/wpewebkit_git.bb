require wpewebkit.inc

SRC_URI = " \
    git://github.com/WebKit/WebKit;protocol=https;branch=webkitglib/2.52 \
    file://0001-Workaround-compiler-bug-for-inlining.patch \
"
SRCREV = "3a9a53db2dbd2ac5bfa43d64014fabf3d504c245"
S = "${WORKDIR}/git"