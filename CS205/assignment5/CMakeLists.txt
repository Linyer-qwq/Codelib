cmake_minimum_required(VERSION 3.10)

project(assignment5)

set(CMAKE_CXX_STANDARD 14)

aux_source_directory(. DIR_SRCS)

add_executable(assignment5 ${DIR_SRCS})