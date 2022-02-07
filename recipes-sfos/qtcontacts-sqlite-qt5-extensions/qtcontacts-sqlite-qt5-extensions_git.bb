# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "SQLite-based plugin for QtPIM Contacts"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.BSD
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=caa037e0975ee5862b72644673e7590c"

SRC_URI = "git://github.com/sailfishos/qtcontacts-sqlite;protocol=https;branch=master"

DEPENDS += "qtbase sqlite mlite qtpim"

# Modify these as desired
PV = "0.3.9+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

# NOTE: spec file indicates the license may be "BSD"
inherit qmake5
B="${S}"
do_install:append() {
  cp -Ra ${D}/include/ ${D}/usr
  cp -Ra ${D}/lib      ${D}/usr
  rm -rf ${D}/include  ${D}/lib
}
FILES:${PN} += "   /include/qtcontacts-sqlite-qt5-extensions/ \
  /lib/pkgconfig/qtcontacts-sqlite-qt5-extensions.pc \
  /opt/tests/qtcontacts-sqlite-qt5/ \
  /usr/lib/qtcontacts-sqlite-qt5/libtestdlgg.so \
  /usr/lib/plugins/contacts/libqtcontacts_sqlite.so "

