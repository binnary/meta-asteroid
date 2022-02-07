# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "D-Bus Service for changing and generating passwords"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/sailfishos/password-manager;protocol=https;branch=master"

# Modify these as desired
PV = "0.1.5+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS = "qtbase systemd libshadowutils"
# NOTE: spec file indicates the license may be "GPLv2+"
inherit qmake5
#FILES:${PN} +=  "/usr/share /usr/lib"
FILES:${PN} += "/usr/lib/systemd/system/dbus-org.nemo.passwordmanager.service"
FILES:${PN} += "/usr/share/dbus-1/system-services/org.nemo.passwordmanager.service"
#FILES:${PN}-dev +=  "/usr/share /usr/lib"

