# Hands-On Project Reactor: Mono, Flux, and Operators

This repository contains hands-on examples and implementations using Project Reactor, focusing on Mono, Flux, and the various operators provided by the library. The goal is to showcase practical use cases, experiments, and exercises to help developers better understand reactive programming with Project Reactor.

## Overview

Project Reactor is a fully non-blocking, asynchronous library for building reactive applications on the JVM. It is the foundation of Spring WebFlux and other reactive libraries.

This repository demonstrates how to use Mono and Flux for handling asynchronous sequences of data, as well as leveraging various operators to create efficient, maintainable, and scalable reactive applications.

## Core Concepts

Mono: Represents a sequence that can contain 0 or 1 element.

Flux: Represents a sequence that can contain 0 to N elements.

Reactive programming with Project Reactor involves combining and transforming streams of data, handling errors, and managing concurrency—all while maintaining non-blocking behavior.

## Key Concepts and Operators Covered

The repository includes hands-on examples of the following:

1. Mono Operations

Mono.just(), Mono.empty(), Mono.error(): Basic operations for creating Mono instances.

map(): Transforming the item inside a Mono.

flatMap(): Creating a new Mono from the item.

doOnSuccess(), doOnError(): Side-effect operations on Mono.

subscribe(): Subscribing to a Mono to trigger the reactive stream.

2. Flux Operations

Flux.just(), Flux.range(), Flux.fromIterable(): Creating Flux instances from various data sources.

map(), flatMap(), filter(): Transforming or filtering the data.

reduce(), collect(): Aggregating or collecting data from a Flux.

mergeWith(): Merging multiple Flux streams.

take(), skip(): Controlling the number of items emitted by a Flux.

3. Error Handling

onErrorReturn(), onErrorResume(): Handling errors in a reactive stream.

retry(): Automatically retrying failed operations.

4. Combining and Merging

zip(), combineLatest(), concat(): Combining multiple streams of data into one.

merge(): Merging streams of Mono or Flux instances concurrently.

5. Timeout and Backpressure

timeout(): Adding timeouts to reactive streams.

onBackpressureBuffer(), onBackpressureDrop(): Managing backpressure in a Flux.

6. Concurrency and Scheduling

subscribeOn(): Defining the thread where the subscriber will be executed.

publishOn(): Defining the thread for downstream operations.

## You have some query?

If you have some query, feel free to connect with me here -- [Ranjan Kumar Mandal](https://www.linkedin.com/in/ranjan-kumar-m-818367158/)
