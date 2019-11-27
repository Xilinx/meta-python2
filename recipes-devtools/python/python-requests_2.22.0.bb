SUMMARY = "Python HTTP for Humans."
DESCRIPTION = "Requests allows you to send HTTP/1.1 requests extremely easily. \
There’s no need to manually add query strings to your URLs, or to form-encode \
your POST data. Keep-alive and HTTP connection pooling are 100% automatic, \
thanks to urllib3."
HOMEPAGE = "http://python-requests.org"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8d5a1d1c2d53025e2282c511033f6f7"

FILESEXTRAPATHS_prepend := "${THISDIR}/python-requests:"

SRC_URI[md5sum] = "ee28bee2de76e9198fc41e48f3a7dd47"
SRC_URI[sha256sum] = "11e007a8a2aa0323f5a921e9e6a2d7e4e67d9877e85773fba9ba6419025cbeb4"

inherit pypi setuptools

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-chardet \
    ${PYTHON_PN}-email \
    ${PYTHON_PN}-idna \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-ndg-httpsclient \
    ${PYTHON_PN}-netserver \
    ${PYTHON_PN}-pyasn1 \
    ${PYTHON_PN}-pyopenssl \
    ${PYTHON_PN}-pysocks \
    ${PYTHON_PN}-urllib3 \
    ${PYTHON_PN}-zlib \
"

CVE_PRODUCT = "requests"

BBCLASSEXTEND = "native nativesdk"

