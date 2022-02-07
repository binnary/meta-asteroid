# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Application launch booster for Sailfish Browser"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI = "git://github.com/sailfishos/mapplauncherd-booster-browser;protocol=https;branch=master"

# Modify these as desired
PV = "0.1.3+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS += "qtsvg qtxmlpatterns qtfeedback  mlite"
DEPENDS += " mapplauncherd qtdeclarative qtbase qtmultimedia extra-cmake-modules mapplauncherd-qt"
#DEPENDS += "nemo-qml-plugin-thumbnailer nemo-qml-plugin-dbus  nemo-qml-plugin-policy nemo-qml-plugin-time   nemo-qml-plugin-configuration"
# NOTE: spec file indicates the license may be "LGPLv2"
inherit qmake5

