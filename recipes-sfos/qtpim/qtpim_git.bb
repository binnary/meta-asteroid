# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Qt PIM modules"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.GPLv2
#   LICENSE.LGPLv3
#   LICENSE.LGPLv21
#   LICENSE.FDL
#   LGPL_EXCEPTION.txt
#   LICENSE.GPLv3
#   doc/src/snippets/legal/CatharonLicense.txt
LICENSE = "CLOSED"

SRC_URI = "git://github.com/sailfishos/qtpim;protocol=https;branch=sailfish-5.6"


# Modify these as desired
PV = "git${SRCPV}"
#SRCREV ="acc0cc971e27a1c7b29edd173dac99057ad779a1"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
DEPENDS += "qtbase qtdeclarative qtxmlpatterns"
# NOTE: spec file indicates the license may be "(LGPLv2 or LGPLv3) with exception or GPLv3 or Qt Commercial"
inherit qmake5
do_configure:prepend() {
    # sed -i "/load(qt_build_config)/d" ${S}/.qmake.conf
#    sed -i "/QMAKE_CXXFLAGS += -Wall -std=c++0x/d" ${S}/qtpim.pro
#    sed -i '$aQMAKE_CXXFLAGS += -Wall -std=c++0x' ${S}/qtpim.pro
#    sed -i "/QMAKE_CXXFLAGS += -Wall -std=c++0x/d" ${S}/src/contacts/contacts.pro
#    sed -i '$aQMAKE_CXXFLAGS += -Wall -std=c++0x' ${S}/src/contacts/contacts.pro
#    sed -i "/QMAKE_CXXFLAGS += -Wall -std=c++0x/d" ${S}/src/src.pro
#    sed -i '$aQMAKE_CXXFLAGS += -Wall -std=c++0x' ${S}/src/src.pro
#    sed -i "/QMAKE_CXXFLAGS += -Wall -std=c++0x/d" ${S}/src/versit/versit.pro
#    sed -i '$aQMAKE_CXXFLAGS += -Wall -std=c++0x' ${S}/src/versit/versit.pro
}
do_compile:prepend() {
     echo "${B}"
     for i in `find ${B} -name "*moc*.cpp"`
     do
          sed -i "/#include <memory>/d" $i
     done
#    sed -i "/QMAKE_CXXFLAGS += -Wall -std=c++0x/d" ${S}/qtpim.pro
}

FILES:${PN} += "/usr/lib/ /usr/lib/plugins/versit/ \
  /usr/lib/plugins/organizer \
  /usr/lib/plugins/contacts \
  /usr/lib/qml/QtOrganizer \
  /usr/lib/mkspecs/modules  \
  /usr/share/tests/qorganizeritemfilter/qorganizeritemfilter \
  /usr/share/tests/qorganizeritemsortorder/qorganizeritemsortorder \
  /usr/share/tests/qversitorganizerimporter/qversitorganizerimporter \
  /usr/share/tests/qvcard21writer/qvcard21writer \
  /usr/share/tests/qcontactdetails/qcontactdetails \
  /usr/share/tests/qcontactmanager/qcontactmanager \
  /usr/share/tests/qorganizercollection/qorganizercollection \
  /usr/share/tests/qversitcontactexporter/qversitcontactexporter \
  /usr/share/tests/qversitcontactimporter/qversitcontactimporter \
  /usr/share/tests/unittest/tst_qcontactasync \
  /usr/share/tests/unittest/unittest \
  /usr/share/tests/unittest/tst_qorganizeritemasync \
  /usr/share/tests/unittest/tst_qversitcontactplugins \
  /usr/share/tests/qcontactdetail/qcontactdetail \
  /usr/share/tests/qversitorganizerexporter/qversitorganizerexporter \
  /usr/share/tests/qvcard30writer/qvcard30writer \
  /usr/share/tests/qorganizeritemdetails/qorganizeritemdetails \
  /usr/share/tests/qorganizeritemdetail/qorganizeritemdetail \
  /usr/share/tests/qcontact/qcontact \
  /usr/share/tests/qcontactfilter/qcontactfilter \
  /usr/share/tests/qversitreader/qversitreader \
  /usr/share/tests/qversitdocument/qversitdocument \
  /usr/share/tests/qcontactrelationship/qcontactrelationship \
  /usr/share/tests/qcontactcollection/qcontactcollection \
  /usr/share/tests/qversitwriter/qversitwriter \
  /usr/share/tests/qcontactmanagerdetails/qcontactmanagerdetails \
  /usr/share/tests/qorganizermanagerdetails/qorganizermanagerdetails \
  /usr/share/tests/qorganizeritem/qorganizeritem \
  /usr/share/tests/qorganizermanager/qorganizermanager \
  /usr/share/tests/qcontactsortorder/qcontactsortorder \
  /usr/share/tests/qorganizere2e/qorganizere2e \
  /usr/share/tests/qversitproperty/qversitproperty "

