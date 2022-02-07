# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Library for reading and writing sound files"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   libsndfile/COPYING
#   libsndfile/src/GSM610/COPYRIGHT
#   libsndfile/src/ALAC/LICENSE
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://libsndfile/COPYING;md5=e77fe93202736b47c07035910f47974a \
                    file://libsndfile/src/GSM610/COPYRIGHT;md5=97e265fa1fd10a668bd99c4945fb9200 \
                    file://libsndfile/src/ALAC/LICENSE;md5=ae814d36dc9b3cf65c9b4b7c5d5926dd"

SRC_URI = "gitsm://github.com/sailfishos/libsndfile;protocol=https;branch=master"

# Modify these as desired
PV = "1.0.29+git${SRCPV}"
SRCREV = "adbb501eee6f501465e9c8627b836519e6ba8374"

S = "${WORKDIR}/git"

# NOTE: spec file indicates the license may be "LGPLv2+"
# NOTE: no Makefile found, unable to determine what needs to be done
inherit package_rpm
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
