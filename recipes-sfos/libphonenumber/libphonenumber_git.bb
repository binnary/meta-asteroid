# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A library for manipulating international phone numbers"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   libphonenumber/LICENSE.Chromium
#   libphonenumber/LICENSE
#   libphonenumber/cpp/LICENSE
#   libphonenumber/tools/java/common/src/com/google/i18n/phonenumbers/CopyrightNotice.java
#   libphonenumber/debian/copyright
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://libphonenumber/LICENSE.Chromium;md5=2cb04c789b79c6c8f602dea493cbcc8b \
#                    file://libphonenumber/LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa \
#                    file://libphonenumber/cpp/LICENSE;md5=363822a4d0f7a74c43ecdc2a4c11ae64 \
#                    file://libphonenumber/tools/java/common/src/com/google/i18n/phonenumbers/CopyrightNotice.java;md5=78016911743830b71bf72b2fb7e0b50f \
#                    file://libphonenumber/debian/copyright;md5=e95ee4cf36f99b7e02b1a67cba3ecee4"

SRC_URI = "gitsm://github.com/sailfishos/libphonenumber;protocol=https;branch=master"

# Modify these as desired
PV = "8.12.33+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/libphonenumber/cpp"
DEPENDS = "icu gtest protobuf boost protobuf-c-native protobuf-c"
EXTRA_OECMAKE:append = "-DBUILD_GEOCODER=OFF \
       -DREGENERATE_METADATA=OFF \
       -DUSE_ALTERNATE_FORMATS=OFF \
       -DUSE_PROTOBUF_LITE=ON \
       -DUSE_ICU_REGEXP=ON \
       -DUSE_LITE_METADATA=ON \
       -DUSE_RE2=OFF \
       -DBUILD_STATIC_LIB=OFF "

inherit cmake
OECMAKE_GENERATOR = "Unix Makefiles"
# NOTE: spec file indicates the license may be "ASL 2.0 and BSD and MIT"
# NOTE: no Makefile found, unable to determine what needs to be done
B="${S}"
do_configure:prepend (){
#   patch  -d ../ -p1 < ../..//rpm/0001-Fix-geocoding-build-when-static-libraries-are-off.patch 
}

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
