# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "MMS engine"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/sailfishos/mms-engine;protocol=https;branch=master"

# Modify these as desired
PV = "1.0.80+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
DEPENDS += "qtbase libglibutil libwspcodec libqofonoext libqofono libsoup-2.4 libpng systemd libexif dconf libdbusaccess"
# NOTE: spec file indicates the license may be "GPLv2"
inherit qmake5

