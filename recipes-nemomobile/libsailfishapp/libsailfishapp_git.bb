SUMMARY = "Sailfishos's libsailfishos app"
HOMEPAGE = "https://github.com/sailfishos/libsailfishapp.git"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://COPYING;md5=3b83ef96387f14655fc854ddc3c6bd57"
#PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "git://github.com/sailfishos/libsailfishapp;protocol=https \
"
#file://0001-fix-include.patch
#file://0001-temp.patch 

SRCREV = "${AUTOREV}"
PR = "r1"
PV = "+git${SRCREV}"
S = "${WORKDIR}/git"
inherit qmake5

B = "${S}"

DEPENDS += "qtbase mapplauncherd-qt mlite mapplauncherd mapplauncherd-booster-qtcomponents"
do_configure:prepend() {
    sed -i "/INCPATH = ../include/d" ${S}/src/src.pro
    sed -i '$aINCPATH = ../include' ${S}/src/src.pro
    sed -i 's/SUBDIRS = src data launcher tests doc/SUBDIRS = src data launcher doc/g' ${S}/sailfishapp.pro
    sed -i 's/^LIBS += -L..\/src -lsailfishapp/LIBS += -L..\/src/g' ${S}/launcher/launcher.pro
    sed -i '$aINCLUDEPATH += ${STAGING_INCDIR}/applauncherd ${STAGING_INCDIR}/mdeclarativecache5/' ${S}/src/src.pro
}
do_install:append() {
     mkdir -p ${D}/usr/include/
     cp -Ra  ${D}/include/sailfishapp/* ${D}/usr/include/
     rm -rf ${D}/include
}
FILES:${PN}-dev += "/share/qt5/mkspecs/ /usr/include/"
FILES:${PN} += "/usr/bin/ /usr/lib/ "

