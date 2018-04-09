FROM websphere-liberty:javaee7
MAINTAINER LEAP Program <leap-support@allianz.de>

ENV WLP_ROOT=/opt/ibm/wlp
ENV SRV_ROOT=${WLP_ROOT}/usr/servers/defaultServer

# make output folders writeable
# warning: Logs written here will not be persisted
RUN \
 chgrp -R root ${WLP_ROOT}/output /logs \
 && chmod -R g+wx ${WLP_ROOT}/output /logs

# Add jce policy files
ADD jce-policy-files/ /opt/ibm/java/jre/lib/security/

# Add wars
ADD libertyServer/apps/ ${SRV_ROOT}/apps/

# Add server.xml
ADD libertyServer/server.xml ${SRV_ROOT}/server.xml

# Expose HTTP and HTTPs ports
EXPOSE 8080 9443