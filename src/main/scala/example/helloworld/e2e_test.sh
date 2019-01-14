#!/usr/bin/env bash
[ "$DEBUG" = "1" ] && set -x
set -euo pipefail
err_report() { echo "errexit on line $(caller)" >&2; }
trap err_report ERR
trap 'kill $(jobs -p)' EXIT

server=$1; shift
client=$1; shift
export HELLOWORLD_HOST=localhost
export HELLOWORLD_PORT=$(($RANDOM+2000))
"$server" &
response=$("$client")
expected="Greeting: Hello world"
if [ "$response" != "$expected" ]; then
	>&2 echo "FAIL: Got '$response' but expected '$expected'"
	exit 1
fi
