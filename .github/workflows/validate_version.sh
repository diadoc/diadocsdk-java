#!/bin/bash

VERSION_REGEX='^(0|[1-9][0-9]*)\.(0|[1-9][0-9]*)\.(0|[1-9][0-9]*)(-(0|[1-9][0-9]*|[a-zA-Z-][0-9a-zA-Z-]*)(\.(0|[1-9][0-9]*|[a-zA-Z-][0-9a-zA-Z-]*))*)?(\+[0-9a-zA-Z-]+(\.[0-9a-zA-Z-]+)*)?$'

VERSION="$1"

if [[ -z "$VERSION" ]]; then
  echo "Error: No version provided."
  echo "Usage: $0 <version>"
  exit 1
fi

if [[ "$VERSION" =~ $VERSION_REGEX ]]; then
  echo "Version $VERSION is valid."
  exit 0
else
  echo "Error: Version $VERSION does not match the version regex."
  exit 1
fi
