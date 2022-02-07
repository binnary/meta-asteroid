# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Application launch booster for Silica on QtQuick2"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI = "git://github.com/sailfishos/mapplauncherd-booster-silica.git;protocol=https;branch=main"

# Modify these as desired
PV = "0.5.4+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
do_configure:prepend() {
    sed -i "/INCLUDEPATH += /d" ${S}/booster-silica.pri
    sed -i '$aINCLUDEPATH += ${STAGING_INCDIR}/applauncherd ${STAGING_INCDIR}/mdeclarativecache5/' ${S}/booster-silica.pri
    sed -i "/LIBS += /d" ${S}/booster-silica.pri
    sed -i '$aLIBS += -lapplauncherd -lmdeclarativecache5' ${S}/booster-silica.pri
}
DEPENDS += "qtsvg qtwayland qtxmlpatterns qtfeedback"
DEPENDS += " mapplauncherd qtdeclarative qtbase qtmultimedia extra-cmake-modules mapplauncherd-qt"
DEPENDS += "nemo-qml-plugin-thumbnailer nemo-qml-plugin-dbus  nemo-qml-plugin-policy nemo-qml-plugin-time   nemo-qml-plugin-configuration"
# NOTE: spec file indicates the license may be "LGPLv2"
inherit qmake5
FILES:${PN} += "/usr/share/booster-silica-qt5 /usr/share/booster-silica-media  /usr/lib/systemd/user"
