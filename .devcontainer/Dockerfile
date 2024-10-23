FROM mcr.microsoft.com/devcontainers/base:ubuntu

# this SHELL command is needed to allow using source
SHELL ["/bin/bash", "-c"]    

RUN curl -s "https://get.sdkman.io" | bash
RUN source "/root/.sdkman/bin/sdkman-init.sh" \
                && sdk install java 21.0.5-amzn  \
                && sdk install maven 3.9.9
