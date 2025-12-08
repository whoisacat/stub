#!/bin/sh
cd ..
docker build -f docker/Dockerfile --platform linux/amd64 -t whoisacat/stub:0.0.1-init .
#docker push whoisacat/stub:0.0.1-init
