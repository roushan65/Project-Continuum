# Project Continuum

> Inspired by KNIME — but made for the cloud, and built to survive.  
> No desktop. No install. Just resilient workflows, in your browser.

<p align="center">
  <img src="docs/gifs/logo-ani.gif" width="25%">
</p>

**Visual workflows that actually run — and survive.**

Start with a drop.  
One node. Two.  
Transform. Branch. Loop.  

Each step tiny.  
But at the end — it’s a river.  
A request turned system.  
A click turned outcome.

That’s Continuum.

## Why?

Most tools look good.  
Then break.  
We want graphs that keep running —  
even if Kafka dies, even if S3 lags, even if your code crashes.

## How

- **Canvas:** [Eclipse Theia](https://theia-ide.org/) + [React Flow](https://reactflow.dev/) — drag, drop, real IDE feel  
- **Engine:** [Temporal](https://temporal.io) — durable execution, auto-retry, infinite scale  
- **Events:** Kafka → MQTT over WebSockets — live step-by-step updates  
- **Data:** Parquet tables between nodes — fast, columnar, query-ready  
- **Storage:** AWS S3 (or MinIO for local) — open, no lock-in  
- **Backend:** Kotlin + Spring Boot — typed, clean, contract-safe  
- **Resilience:** [Temporal](https://temporal.io/) owns it. Fails? Retries. Forever.  
- **Flow Control:** Output `null` on a port = flow stops. Simple guard. Real loops coming.

## What’s Missing (and what we want)

- No real loops — but null = break. Works for now.  
- No visual debugger — logs only. Want timeline replay.  
- No plugin store — but soon: Slack, Stripe, DB, AI.  
- No multi-tenancy — one user at a time.  
- No RBAC — anyone edits.  
- **Multi-worker support** — currently one worker.  
  Goal: each plugin runs its *own* worker with its own nodes.  
  All register to a shared Redis registry.  
  Frontend discovers them dynamically.  
  No bundling. No central choke.

Heading for:  
- True while/for loops with condition builder  
- Implement more RDKit nodes
- Implement full AI training node suite using Unsloth
- Zero-config self-host with Docker  

If you see the gap — fill it.  
We don’t want perfect.  
We want working.

## Contribute

See Issues page!

## License

Apache 2.0 — open, safe, patent-protected.

Welcome.  
Break it.  
Fix it.  
Flow with us.