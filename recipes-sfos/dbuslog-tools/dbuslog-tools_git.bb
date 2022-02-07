# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Command line client for libdbuslogserver"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   debian/copyright
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a18b5abfa17357df72ddbd5ea77e6a94 \
                    file://debian/copyright;md5=a18b5abfa17357df72ddbd5ea77e6a94"

SRC_URI = "git://github.com/sailfishos/libdbuslog;protocol=https;branch=master"

# Modify these as desired
PV = "1.0.22+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
DEPENDS += "grilo dbus systemd "
# NOTE: spec file indicates the license may be "BSD"
# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.
#inherit cmake

#do_configure () {
#	# Specify any needed configure commands here
#	:
#}
#
#do_compile () {
#	# You will almost certainly need to add additional arguments here
#	oe_runmake
#}
#
#do_install () {
#	# This is a guess; additional arguments may be required
#	oe_runmake install
#}
#
