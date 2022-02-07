# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Allows embedding Sailfish WebView into applications"
HOMEPAGE = "https://github.com/sailfishos/sailfish-components-webview"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.txt
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=48a3fe23ed1353e0995dadfda05ffdb6"

SRC_URI = "git://github.com/sailfishos/sailfish-components-webview;protocol=https;branch=master"

# Modify these as desired
PV = "1.4.2+git${SRCPV}"
SRCREV = "2eed72e6f141ab08702a2adf65fda516ffc17dad"

S = "${WORKDIR}/git"

DEPENDS = "qtdeclarative qtbase qt5embedwidget"
# NOTE: spec file indicates the license may be "MPLv2.0"
inherit qmake5

