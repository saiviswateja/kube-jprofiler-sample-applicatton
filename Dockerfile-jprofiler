FROM centos:7

# Switch to root
USER 0

ENV \
JPROFILER_DISTRO="jprofiler_linux_10_1_1.tar.gz" \
STAGING_DIR="/jprofiler-staging" \
HOME="/jprofiler10.1.1"

LABEL \
io.k8s.display-name="JProfiler from ${JPROFILER_DISTRO}"

# Install epel-release and required packages
RUN curl -v -OL "https://download.ej-technologies.com/jprofiler/${JPROFILER_DISTRO}" -H "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.62 Safari/537.36" \
&& tar -xzf ${JPROFILER_DISTRO} \
&& rm -f ${JPROFILER_DISTRO} \
&& chmod -R 0775 ${HOME}

# WORKDIR ${HOME}