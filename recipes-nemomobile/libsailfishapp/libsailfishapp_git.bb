SUMMARY = "Sailfishos's libsailfishos app"
HOMEPAGE = "https://github.com/sailfishos/libsailfishapp.git"
LICENSE = "CLOSED"

#LIC_FILES_CHKSUM = "file://COPYING;md5=3b83ef96387f14655fc854ddc3c6bd57"

#PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "git://github.com/sailfishos/libsailfishapp;protocol=https \
file://0001-fix-include.patch \
"
#file://0001-temp.patch 

SRCREV = "${AUTOREV}"
PR = "r1"
PV = "+git${SRCREV}"
S = "${WORKDIR}/git"

DEPENDS += "qtbase mapplauncherd-qt mlite mapplauncherd mapplauncherd-booster-qtcomponents"

inherit qmake5
FILES:${PN}-dev += "/share/qt5/mkspecs/ /include/"
FILES:${PN} += "/usr/bin/ /usr/lib/ "

