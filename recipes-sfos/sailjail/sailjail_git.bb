# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Firejail-based sanboxing tool"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=5373835f6c082e9d709e6e51a596adb5"

SRC_URI = "git://github.com/sailfishos/sailjail;protocol=https;branch=master"

# Modify these as desired
PV = "1.1.19+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
DEPENDS +=" glib-2.0 systemd dbus libdbusaccess gnutls"
#DEPENDS += "glib-2.0 gnutls libglibutil bison-native flex-native  pkgconfig-native"
# NOTE: spec file indicates the license may be "BSD"
# NOTE: no Makefile found, unable to determine what needs to be done
inherit meson
#do_configure () {
#	# Specify any needed configure commands here
#	:
#}
#
#do_compile () {
#	# Specify compilation commands here
#	:
#}
#
#do_install () {
#	# Specify install commands here
#	:
#}
#
